-- I would recommend using pgAdmin to create the tables,
-- then copy the sql from the 'SQL Pane' to here
-- so we have scripts that we can run on the servers.
-- Table: mmuser

-- DROP TABLE mmuser;

CREATE TABLE mmuser
(
  id serial NOT NULL,
  email character varying(255) NOT NULL,
  usertype character varying(255),
  linkedinid character varying(255) NOT NULL,
  isadmin boolean NOT NULL default false,
  CONSTRAINT user_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE mmuser
  OWNER TO ideavillage;


-- Table: mentor

CREATE TABLE mentor
(
  id serial NOT NULL,
  linkedinid character varying(255),
  firstname character varying(255),
  lastname character varying(255),
  industry character varying(255),
  areasofexpertise text,
  background text,
  linkedinpictureurl character varying(255),
  linkedincurrentcompany character varying(255),
  linkedincurrentjobtitle character varying(255),
  website character varying(255),
  facebook character varying(255),
  twitter character varying(255),
  othersocialmedia character varying(255),
  mmuser bigint NOT NULL,
  CONSTRAINT mentor_pkey PRIMARY KEY (id),
  CONSTRAINT foreign_key_mmuser FOREIGN KEY (mmuser)
      REFERENCES mmuser (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE mentor
  OWNER TO ideavillage;

-- Table: founder

CREATE TABLE founder
(
  id serial NOT NULL,
  firstname character varying(255),
  lastname character varying(255),
  industry character varying(255),
  areasofexpertise text,
  background text,
  linkedinid text,
  linkedinpictureurl character varying(255),
  linkedincurrentcompany character varying(255),
  linkedincurrentjobtitle character varying(255),
  website character varying(255),
  facebook character varying(255),
  twitter character varying(255),
  othersocialmedia character varying(255),
  mmuser bigint NOT NULL,
  logo character varying(255),
  tagline character varying(255),
  elevatorpitch text,
  immediateneeds text,
  companydetails text,
  inspiration text,
  status text,
  vision text,
  neworleans text,
  programplan text,
  weeklyreports text,
  CONSTRAINT founder_pkey PRIMARY KEY (id),
  CONSTRAINT foreign_key_mmuser FOREIGN KEY (mmuser)
      REFERENCES mmuser (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE founder
OWNER TO ideavillage;

-- Table: userconnection

-- DROP TABLE userconnection;

CREATE TABLE userconnection
(
  userid character varying(255) NOT NULL,
  providerid character varying(255) NOT NULL,
  provideruserid character varying(255) NOT NULL,
  rank integer NOT NULL,
  displayname character varying(255),
  profileurl character varying(512),
  imageurl character varying(512),
  accesstoken character varying(255) NOT NULL,
  secret character varying(255),
  refreshtoken character varying(255),
  expiretime bigint,
  CONSTRAINT userconnection_pkey PRIMARY KEY (userid, providerid, provideruserid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE userconnection
  OWNER TO ideavillage;

-- Index: userconnectionrank

-- DROP INDEX userconnectionrank;

CREATE UNIQUE INDEX userconnectionrank
  ON userconnection
  USING btree
  (userid COLLATE pg_catalog."default", providerid COLLATE pg_catalog."default", rank);

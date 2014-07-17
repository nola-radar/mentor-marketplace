-- I would recommend using pgAdmin to create the tables,
-- then copy the sql from the 'SQL Pane' to here
-- so we have scripts that we can run on the servers.

CREATE TABLE mentor
(
  id serial NOT NULL,
  firstname character(255),
  lastname character(255),
  industry character(255),
  areasofexpertise text,
  linkedinid text,
  linkedinpictureurl character(255),
  linkedincurrentcompany character(255),
  linkedincurrentjobtitle character(255),
  CONSTRAINT mentor_pkey PRIMARY KEY (id),
  CONSTRAINT unique_linkedin_id UNIQUE (linkedinid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE mentor
  OWNER TO ideavillage;

CREATE TABLE founder
(
  id serial NOT NULL,
  linkedinid text,
  industry text,
  CONSTRAINT founder_pkey PRIMARY KEY (id)
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

-- Table: mmuser

-- DROP TABLE mmuser;

CREATE TABLE mmuser
(
  id serial NOT NULL,
  email character varying(255) NOT NULL,
  linkedinid character varying(255) NOT NULL,
  CONSTRAINT user_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE mmuser
  OWNER TO ideavillage;

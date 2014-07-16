-- I would recommend using pgAdmin to create the tables,
-- then copy the sql from the 'SQL Pane' to here
-- so we have scripts that we can run on the servers.

CREATE TABLE entrepreneur
(
  id serial NOT NULL,
  -- these two fields should probably be varchar with an appropriate length
  linkedinid text,
  industry text,
  CONSTRAINT entrepreneur_pkey PRIMARY KEY (id),
  CONSTRAINT unique_linkedin_id UNIQUE (linkedinid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE entrepreneur
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
  id integer NOT NULL DEFAULT nextval('user_id_seq'::regclass),
  email character varying(255) NOT NULL,
  linkedinid character varying(255) NOT NULL,
  CONSTRAINT user_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE mmuser
  OWNER TO ideavillage;

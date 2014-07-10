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



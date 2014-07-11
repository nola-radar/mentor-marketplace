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
  linkedincurrentcurrentjobtitle character(255),
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


-- I would recommend using pgAdmin to create the database,
-- then copy the sql from the 'SQL Pane' to here
-- so we have scripts that we can run on the servers.
-- Probably won't need anymore databases though.

CREATE DATABASE mentormarketplace
  WITH OWNER = ideavillage
       TEMPLATE = template0
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'C'
       LC_CTYPE = 'C'
       CONNECTION LIMIT = -1;
-- I would recommend using pgAdmin to create users,
-- then copy the sql from the 'SQL Pane' to here
-- so we have scripts that we can run on the servers.
-- Probably won't need anymore users though.

CREATE ROLE ideavillage LOGIN
  ENCRYPTED PASSWORD 'md5ad70a7e9477ed1f9c6168060e61cd4af'
  NOSUPERUSER INHERIT CREATEDB NOCREATEROLE NOREPLICATION;
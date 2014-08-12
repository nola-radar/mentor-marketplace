--Initial table setup script for Ideavillage
--V1 
CREATE TABLE mmuser
(
id SERIAL NOT NULL,
email VARCHAR(255) NOT NULL,
usertype VARCHAR(255),
linkedinid VARCHAR(255) NOT NULL,
isadmin BOOLEAN NOT NULL DEFAULT FALSE,
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
linkedinid VARCHAR(255),
firstname VARCHAR(255),
lastname VARCHAR(255),
industry VARCHAR(255),
background text,
linkedinpictureurl VARCHAR(255),
linkedincurrentcompany VARCHAR(255),
linkedincurrentjobtitle VARCHAR(255),
website VARCHAR(255),
facebook VARCHAR(255),
twitter VARCHAR(255),
othersocialmedia VARCHAR(255),
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
firstname VARCHAR(255),
lastname VARCHAR(255),
linkedinpictureurl VARCHAR(255),
linkedincurrentcompany VARCHAR(255),
linkedincurrentjobtitle VARCHAR(255),
website VARCHAR(255),
facebook VARCHAR(255),
twitter VARCHAR(255),
othersocialmedia VARCHAR(255),
mmuser bigint NOT NULL,
logo VARCHAR(255),
tagline VARCHAR(255),
linkedinid VARCHAR(255),
background text,
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
CREATE TABLE userconnection
(
userid VARCHAR(255) NOT NULL,
providerid VARCHAR(255) NOT NULL,
provideruserid VARCHAR(255) NOT NULL,
rank INTEGER NOT NULL,
displayname VARCHAR(255),
profileurl VARCHAR(512),
imageurl VARCHAR(512),
accesstoken VARCHAR(255) NOT NULL,
secret VARCHAR(255),
refreshtoken VARCHAR(255),
expiretime bigint,
CONSTRAINT userconnection_pkey PRIMARY KEY (userid, providerid, provideruserid)
)
WITH (
OIDS=FALSE
);
ALTER TABLE userconnection
OWNER TO ideavillage;

-- Index: userconnectionrank
CREATE UNIQUE INDEX userconnectionrank
ON userconnection
USING btree
(userid COLLATE pg_catalog."default", providerid COLLATE pg_catalog."default", rank);


-- Table: expertise
CREATE TABLE expertise
(
id serial NOT NULL,
expertise VARCHAR(255),
CONSTRAINT expertise_pkey PRIMARY KEY (id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE expertise
OWNER TO ideavillage;


-- Table: industry
CREATE TABLE industry
(
id serial NOT NULL,
industry VARCHAR(255),
CONSTRAINT industry_pkey PRIMARY KEY (id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE industry
OWNER TO ideavillage;


-- Table: founder_expertise
CREATE TABLE founder_expertise
(
id serial NOT NULL,
founder_id INTEGER,
expertise_id INTEGER,
CONSTRAINT id_pkey PRIMARY KEY (id),
CONSTRAINT expertise_id_fkey FOREIGN KEY (expertise_id)
    REFERENCES expertise (id) MATCH SIMPLE
    ON UPDATE NO ACTION ON DELETE NO ACTION,
CONSTRAINT founder_id_fkey FOREIGN KEY (founder_id)
    REFERENCES founder (id) MATCH SIMPLE
    ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
OIDS=FALSE
);
ALTER TABLE founder_expertise
OWNER TO ideavillage;

-- Index: fki_expertise_id_fkey
CREATE INDEX fki_expertise_id_fkey
ON founder_expertise
USING btree
(expertise_id);

-- Index: fki_founder_id_fkey
CREATE INDEX fki_founder_id_fkey
ON founder_expertise
USING btree
(founder_id);


-- Table: founder_industry
CREATE TABLE founder_industry
(
id serial NOT NULL,
founder_id INTEGER,
industry_id INTEGER,
CONSTRAINT founder_industry_pkey PRIMARY KEY (id),
CONSTRAINT fk_founder_id FOREIGN KEY (founder_id)
    REFERENCES founder (id) MATCH SIMPLE
    ON UPDATE NO ACTION ON DELETE NO ACTION,
CONSTRAINT fk_industry_id FOREIGN KEY (industry_id)
    REFERENCES industry (id) MATCH SIMPLE
    ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
OIDS=FALSE
);
ALTER TABLE founder_industry
OWNER TO ideavillage;

-- Index: fki_founder_id
CREATE INDEX fki_founder_id
ON founder_industry
USING btree
(founder_id);

-- Index: fki_industry_id
CREATE INDEX fki_industry_id
ON founder_industry
USING btree
(industry_id);


-- Table: mentor_expertise
CREATE TABLE mentor_expertise
(
id serial NOT NULL,
mentor_id INTEGER,
expertise_id INTEGER,
CONSTRAINT mentor_expertise_pkey PRIMARY KEY (id),
CONSTRAINT mentor_expertise_fkey FOREIGN KEY (expertise_id)
    REFERENCES expertise (id) MATCH SIMPLE
    ON UPDATE NO ACTION ON DELETE NO ACTION,
CONSTRAINT mentor_fkey_id FOREIGN KEY (mentor_id)
    REFERENCES mentor (id) MATCH SIMPLE
    ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
OIDS=FALSE
);
ALTER TABLE mentor_expertise
OWNER TO ideavillage;

-- Index: fki_mentor_expertise_fkey
CREATE INDEX fki_mentor_expertise_fkey
ON mentor_expertise
USING btree
(expertise_id);

-- Index: fki_mentor_fkey_id
CREATE INDEX fki_mentor_fkey_id
ON mentor_expertise
USING btree
(mentor_id);


-- Table: mentor_industry
CREATE TABLE mentor_industry
(
id serial NOT NULL,
mentor_id INTEGER,
industry_id INTEGER,
CONSTRAINT mentor_industry_pkey PRIMARY KEY (id),
CONSTRAINT mentor_id_fkey FOREIGN KEY (mentor_id)
    REFERENCES mentor (id) MATCH SIMPLE
    ON UPDATE NO ACTION ON DELETE NO ACTION,
CONSTRAINT mentor_industry_id_fkey FOREIGN KEY (industry_id)
    REFERENCES industry (id) MATCH SIMPLE
    ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
OIDS=FALSE
);
ALTER TABLE mentor_industry
OWNER TO ideavillage;

-- Index: fki_mentor_id_fkey
CREATE INDEX fki_mentor_id_fkey
ON mentor_industry
USING btree
(mentor_id);

-- Index: fki_mentor_industry_id_fkey
CREATE INDEX fki_mentor_industry_id_fkey
ON mentor_industry
USING btree
(industry_id);








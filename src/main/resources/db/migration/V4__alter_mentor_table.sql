ALTER TABLE mentor
  RENAME COLUMN background to experience;

ALTER TABLE mentor
ADD education text;

ALTER TABLE mentor
DROP COLUMN industry;

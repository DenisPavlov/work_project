DROP TABLE IF EXISTS interval_table;

CREATE TABLE interval_table
(
  id          INTEGER    PRIMARY KEY,
  c_time      INTERVAL   NOT NULL
);
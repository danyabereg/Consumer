CREATE TABLE events
(
    id         BIGSERIAL PRIMARY KEY,
    name       VARCHAR(16) NOT NULL,
    title      VARCHAR(64) NOT NULL,
    price      NUMERIC(8, 2),
    quantity   INT         NOT NULL,
    event_date TIMESTAMP   NOT NULL
)
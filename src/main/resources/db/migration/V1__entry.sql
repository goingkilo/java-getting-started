CREATE TABLE public.entry (
    id bigint NOT NULL,
    created timestamp without time zone,
    description character varying(255),
    last_updated timestamp without time zone,
    latitude double precision NOT NULL,
    longitude double precision NOT NULL,
    owner character varying(255),
    status character varying(255)
);


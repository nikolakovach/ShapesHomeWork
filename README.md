# ShapesHomeWork
-For this Maven project I'm using Postgres 10.8
-Shape area calculations needs database wich is manualy configured.
DataBase spec:
-database name: "shapes"

-query for table "circle" = "CREATE TABLE public.circle
(
    id integer NOT NULL DEFAULT nextval('circle_id_seq'::regclass) ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    radius double precision NOT NULL,
    CONSTRAINT circle_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.circle
    OWNER to postgres;"
    
-query for table "triangle" = "CREATE TABLE public.triangle
(
    id integer NOT NULL DEFAULT nextval('triangle_id_seq'::regclass) ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    base character varying COLLATE pg_catalog."default" NOT NULL,
    height character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT triangle_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.triangle
    OWNER to postgres;"

-query for table "square" = "CREATE TABLE public.square
(
    id integer NOT NULL DEFAULT nextval('square_id_seq'::regclass) ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    width double precision NOT NULL,
    lenght double precision NOT NULL,
    CONSTRAINT square_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.square
    OWNER to postgres;"

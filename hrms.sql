-- Table: public.users

-- DROP TABLE public.users;

CREATE TABLE public.users
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    email character varying(50) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT users_pkey PRIMARY KEY (id),
	CONSTRAINT users_ukey UNIQUE (email)
	
)

TABLESPACE pg_default;

ALTER TABLE public.users
    OWNER to postgres;






-- Table: public.system_personels

-- DROP TABLE public.system_personels;

CREATE TABLE public.system_personels
(
	id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    user_id integer NOT NULL,
    firstname character varying(50) COLLATE pg_catalog."default" NOT NULL,
    lastname character varying(50) COLLATE pg_catalog."default" NOT NULL,
	profession character varying(50) COLLATE pg_catalog."default" NOT NULL,
	date_of_birth date NOT NULL,
	date_of_start date NOT NULL,
	nationality_id character varying(11) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT system_personels_pkey PRIMARY KEY (id),
	CONSTRAINT system_personels_ukey UNIQUE (nationality_id),
    CONSTRAINT system_personel_users_fk FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public.system_personels
    OWNER to postgres;





-- Table: public.job_seekers

-- DROP TABLE public.job_seekers;

CREATE TABLE public.job_seekers
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    user_id integer NOT NULL,
    firstname character varying(50) COLLATE pg_catalog."default" NOT NULL,
    lastname character varying(50) COLLATE pg_catalog."default" NOT NULL,
	nationality_id character varying(11) COLLATE pg_catalog."default" NOT NULL,
	date_of_birth date NOT NULL,
	password character varying(150) COLLATE pg_catalog."default" NOT NULL,

    CONSTRAINT job_seekers_pkey PRIMARY KEY (id),
	CONSTRAINT job_seekers_ukey UNIQUE (nationality_id),
    CONSTRAINT job_seekers_users_fk FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public.job_seekers
    OWNER to postgres;





-- Table: public.employers

-- DROP TABLE public.employers;

CREATE TABLE public.employers
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    user_id integer NOT NULL,
    company_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    website character varying(50) COLLATE pg_catalog."default" NOT NULL,
	phone character varying(50) COLLATE pg_catalog."default" NOT NULL,
	password character varying(150) COLLATE pg_catalog."default" NOT NULL,

    CONSTRAINT employers_pkey PRIMARY KEY (id),
	
    CONSTRAINT employers_users_fk FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public.employers
    OWNER to postgres;








-- Table: public.job_positions

-- DROP TABLE public.job_positions;

CREATE TABLE public.job_positions
(
    id integer NOT NULL GENERATED BY DEFAULT AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    title character varying(100) COLLATE pg_catalog."default" NOT NULL,
	CONSTRAINT job_positions_ukey UNIQUE (title),
    CONSTRAINT job_positions_pkey PRIMARY KEY (id)
	
)

TABLESPACE pg_default;

ALTER TABLE public.job_positions
    OWNER to postgres;
	
	
	
-- Table: public.email_token

-- DROP TABLE public.email_token;

CREATE TABLE public.email_token
(
    id integer NOT NULL GENERATED BY DEFAULT AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    user_id integer NOT NULL,
	expiry_date date NOT NULL,
	token character varying(250) COLLATE pg_catalog."default" NOT NULL,
	CONSTRAINT email_token_ukey UNIQUE (token),
    CONSTRAINT email_token_pkey PRIMARY KEY (id),
	 CONSTRAINT email_token_fk FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
	
)

TABLESPACE pg_default;

ALTER TABLE public.email_token
    OWNER to postgres;
	
	
	
-- Table: public.mernis_verification

-- DROP TABLE public.mernis_verification;

CREATE TABLE public.mernis_verification
(
    id integer NOT NULL GENERATED BY DEFAULT AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    user_id integer NOT NULL,
    CONSTRAINT mernis_verification_pkey PRIMARY KEY (id),
	CONSTRAINT mernis_verification_fk FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
	
)

TABLESPACE pg_default;

ALTER TABLE public.mernis_verification
    OWNER to postgres;
	
	
	
-- Table: public.job_seekers_email_verification

-- DROP TABLE public.job_seekers_email_verification;

CREATE TABLE public.job_seekers_email_verification
(
    id integer NOT NULL GENERATED BY DEFAULT AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    job_seekers_id integer NOT NULL,
    CONSTRAINT job_seekers_email_verification_pkey PRIMARY KEY (id),
	CONSTRAINT job_seekers_email_verification_fk FOREIGN KEY (job_seekers_id)
        REFERENCES public.job_seekers (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
	
)

TABLESPACE pg_default;

ALTER TABLE public.job_seekers_email_verification
    OWNER to postgres;
	
	
	
-- Table: public.employers_email_verification

-- DROP TABLE public.employers_email_verification;

CREATE TABLE public.employers_email_verification
(
    id integer NOT NULL GENERATED BY DEFAULT AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    employers_id integer NOT NULL,
    CONSTRAINT employers_email_verification_pkey PRIMARY KEY (id),
	CONSTRAINT employers_email_verification_fk FOREIGN KEY (employers_id)
        REFERENCES public.employers (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
	
)

TABLESPACE pg_default;

ALTER TABLE public.employers_email_verification
    OWNER to postgres;
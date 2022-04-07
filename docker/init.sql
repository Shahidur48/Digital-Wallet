CREATE TABLE IF NOT EXISTS public.organizations
(
    organization_id text COLLATE pg_catalog."default" NOT NULL,
    name text COLLATE pg_catalog."default",
    contact_name text COLLATE pg_catalog."default",
    contact_email text COLLATE pg_catalog."default",
    contact_phone text COLLATE pg_catalog."default",
    CONSTRAINT organizations_pkey PRIMARY KEY (organization_id)
)

TABLESPACE pg_default;

ALTER TABLE public.organizations
    OWNER to postgres;


CREATE TABLE IF NOT EXISTS public.licenses
(
    license_id text COLLATE pg_catalog."default" NOT NULL,
    organization_id text COLLATE pg_catalog."default" NOT NULL,
    description text COLLATE pg_catalog."default",
    product_name text COLLATE pg_catalog."default" NOT NULL,
    license_type text COLLATE pg_catalog."default" NOT NULL,
    comment text COLLATE pg_catalog."default",
    CONSTRAINT licenses_pkey PRIMARY KEY (license_id),
    CONSTRAINT licenses_organization_id_fkey FOREIGN KEY (organization_id)
        REFERENCES public.organizations (organization_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public.licenses
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.roles
(
    role_id bigint NOT NULL,
    role_name text COLLATE pg_catalog."default" NOT NULL,
    role_desc text COLLATE pg_catalog."default",
    CONSTRAINT user_role_pkey PRIMARY KEY (role_id)
)

    TABLESPACE pg_default;

ALTER TABLE public.roles
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.users
(
    user_id bigint NOT NULL,
    first_name text COLLATE pg_catalog."default",
    last_name text COLLATE pg_catalog."default",
    role_id bigint,
    dob text COLLATE pg_catalog."default",
    phone text COLLATE pg_catalog."default",
    email text COLLATE pg_catalog."default",
    CONSTRAINT user_pkey PRIMARY KEY (user_id),
    CONSTRAINT user_role_id_fkey FOREIGN KEY (role_id)
        REFERENCES public.roles (role_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

    TABLESPACE pg_default;

ALTER TABLE public.users
    OWNER to postgres;
CREATE TABLE IF NOT EXISTS public.categories
(
    cat_id bigint NOT NULL,
    cat_name text COLLATE pg_catalog."default" NOT NULL,
    cat_desc text COLLATE pg_catalog."default",
    CONSTRAINT cat_pkey PRIMARY KEY (cat_id)
)

    TABLESPACE pg_default;

ALTER TABLE public.categories
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.products
(
    product_id bigint NOT NULL,
    product_name text COLLATE pg_catalog."default" NOT NULL,
    product_desc text COLLATE pg_catalog."default",
    cat_id bigint,
    product_status text COLLATE pg_catalog."default",
    CONSTRAINT product_pkey PRIMARY KEY (product_id),
    CONSTRAINT cat_id_fkey FOREIGN KEY (cat_id)
    REFERENCES public.categories (cat_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
    )

    TABLESPACE pg_default;

ALTER TABLE public.products
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.product_rate
(
    product_id bigint NOT NULL,
    min_value bigint,
    max_value bigint,
    role_id bigint,
    state_tax bigint,
    product_value bigint,
    discount_value bigint,
    CONSTRAINT product_id_fkey FOREIGN KEY (product_id)
    REFERENCES public.products (product_id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID
    )

    TABLESPACE pg_default;

ALTER TABLE public.product_rate
    OWNER to postgres;

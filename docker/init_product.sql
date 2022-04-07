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

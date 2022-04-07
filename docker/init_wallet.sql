CREATE TABLE IF NOT EXISTS public.wallets
(
    wallet_id bigint NOT NULL,
    wallet_name text COLLATE pg_catalog."default" NOT NULL,
    wallet_desc text COLLATE pg_catalog."default",
    is_default text COLLATE pg_catalog."default",
    CONSTRAINT wallet_pkey PRIMARY KEY (wallet_id)
)

    TABLESPACE pg_default;

ALTER TABLE public.wallets
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.journals
(
    ledger_id bigint NOT NULL,
    debit bigint,
    credit bigint,
    ref_id bigint,
    CONSTRAINT ledger_id_pkey PRIMARY KEY (ledger_id)
)

    TABLESPACE pg_default;

ALTER TABLE public.journals
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.user_wallet
(
    id bigint NOT NULL,
    user_id bigint NOT NULL,
    wallet_id bigint NOT NULL,
    balance bigint,
    CONSTRAINT user_wallet_id_pkey PRIMARY KEY (id),
    CONSTRAINT wallet_id_fkey FOREIGN KEY (wallet_id)
    REFERENCES public.wallets (wallet_id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID
    )

    TABLESPACE pg_default;

ALTER TABLE public.user_wallet
    OWNER to postgres;

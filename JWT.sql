--
-- PostgreSQL database dump
--

-- Dumped from database version 16.4
-- Dumped by pg_dump version 16.4

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: cv_shema; Type: SCHEMA; Schema: -; Owner: springBootCVAdmin
--

CREATE SCHEMA cv_shema;


ALTER SCHEMA cv_shema OWNER TO "springBootCVAdmin";

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: role; Type: TABLE; Schema: cv_shema; Owner: springBootCVAdmin
--

CREATE TABLE cv_shema.role (
    id_role bigint NOT NULL,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    date_modified timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    role character varying(20) NOT NULL
);


ALTER TABLE cv_shema.role OWNER TO "springBootCVAdmin";

--
-- Name: role_id_role_seq; Type: SEQUENCE; Schema: cv_shema; Owner: springBootCVAdmin
--

ALTER TABLE cv_shema.role ALTER COLUMN id_role ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME cv_shema.role_id_role_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- Name: user; Type: TABLE; Schema: cv_shema; Owner: springBootCVAdmin
--

CREATE TABLE cv_shema."user" (
    id_user bigint NOT NULL,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    date_modified timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    disabled boolean NOT NULL,
    email character varying(50) NOT NULL,
    locked boolean NOT NULL,
    password character varying(200),
    username character varying(20) NOT NULL
);


ALTER TABLE cv_shema."user" OWNER TO "springBootCVAdmin";

--
-- Name: user_id_user_seq; Type: SEQUENCE; Schema: cv_shema; Owner: springBootCVAdmin
--

ALTER TABLE cv_shema."user" ALTER COLUMN id_user ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME cv_shema.user_id_user_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- Name: user_role; Type: TABLE; Schema: cv_shema; Owner: springBootCVAdmin
--

CREATE TABLE cv_shema.user_role (
    id_user bigint NOT NULL,
    id_role bigint NOT NULL
);


ALTER TABLE cv_shema.user_role OWNER TO "springBootCVAdmin";

--
-- Name: user_seq; Type: SEQUENCE; Schema: cv_shema; Owner: springBootCVAdmin
--

CREATE SEQUENCE cv_shema.user_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE cv_shema.user_seq OWNER TO "springBootCVAdmin";

--
-- Data for Name: role; Type: TABLE DATA; Schema: cv_shema; Owner: springBootCVAdmin
--

COPY cv_shema.role (id_role, created_at, date_modified, role) FROM stdin;
1	2024-09-18 11:06:51.993	2024-09-18 11:06:51.993	ADMIN
2	2024-09-18 11:18:42.171	2024-09-18 11:18:42.171	DEVELOPER
\.


--
-- Data for Name: user; Type: TABLE DATA; Schema: cv_shema; Owner: springBootCVAdmin
--

COPY cv_shema."user" (id_user, created_at, date_modified, disabled, email, locked, password, username) FROM stdin;
1	2024-09-18 00:16:03.038	2024-09-18 00:16:03.038	f	admin@gmail.com	f	$2y$10$tnXkA0YIHP2n5bKqj6XwRuZDOzQpsNaI/DzuNzlerVk259zcCNLoS	admin
2	2024-09-18 11:15:19.102	2024-09-18 11:15:19.102	f	dev1@gmail.com	f	$2y$10$UoxqOL//sE9Fa0BQdgsY2.oIOD3dmcds20YFbMbxGld.GaA9IQ5B2	dev1
9	2024-09-19 14:30:00	2024-09-19 14:30:00	f	jhonk@example.com	f	$2a$10$uJBVtwrU..eWGJzZToPL8.2dyTgrWY1OTCOHA8kNE38IuyEf3BwgS	jhonk
\.


--
-- Data for Name: user_role; Type: TABLE DATA; Schema: cv_shema; Owner: springBootCVAdmin
--

COPY cv_shema.user_role (id_user, id_role) FROM stdin;
1	1
2	2
9	1
\.


--
-- Name: role_id_role_seq; Type: SEQUENCE SET; Schema: cv_shema; Owner: springBootCVAdmin
--

SELECT pg_catalog.setval('cv_shema.role_id_role_seq', 4, true);


--
-- Name: user_id_user_seq; Type: SEQUENCE SET; Schema: cv_shema; Owner: springBootCVAdmin
--

SELECT pg_catalog.setval('cv_shema.user_id_user_seq', 9, true);


--
-- Name: user_seq; Type: SEQUENCE SET; Schema: cv_shema; Owner: springBootCVAdmin
--

SELECT pg_catalog.setval('cv_shema.user_seq', 4, true);


--
-- Name: role role_pkey; Type: CONSTRAINT; Schema: cv_shema; Owner: springBootCVAdmin
--

ALTER TABLE ONLY cv_shema.role
    ADD CONSTRAINT role_pkey PRIMARY KEY (id_role);


--
-- Name: user ukob8kqyqqgmefl0aco34akdtpe; Type: CONSTRAINT; Schema: cv_shema; Owner: springBootCVAdmin
--

ALTER TABLE ONLY cv_shema."user"
    ADD CONSTRAINT ukob8kqyqqgmefl0aco34akdtpe UNIQUE (email);


--
-- Name: user user_pkey; Type: CONSTRAINT; Schema: cv_shema; Owner: springBootCVAdmin
--

ALTER TABLE ONLY cv_shema."user"
    ADD CONSTRAINT user_pkey PRIMARY KEY (id_user);


--
-- Name: user_role user_role_pkey; Type: CONSTRAINT; Schema: cv_shema; Owner: springBootCVAdmin
--

ALTER TABLE ONLY cv_shema.user_role
    ADD CONSTRAINT user_role_pkey PRIMARY KEY (id_user, id_role);


--
-- Name: user_role fk2aam9nt2tv8vcfymi3jo9c314; Type: FK CONSTRAINT; Schema: cv_shema; Owner: springBootCVAdmin
--

ALTER TABLE ONLY cv_shema.user_role
    ADD CONSTRAINT fk2aam9nt2tv8vcfymi3jo9c314 FOREIGN KEY (id_role) REFERENCES cv_shema.role(id_role);


--
-- Name: user_role fkfhxaael2m459kbk8lv8smr5iv; Type: FK CONSTRAINT; Schema: cv_shema; Owner: springBootCVAdmin
--

ALTER TABLE ONLY cv_shema.user_role
    ADD CONSTRAINT fkfhxaael2m459kbk8lv8smr5iv FOREIGN KEY (id_user) REFERENCES cv_shema."user"(id_user);


--
-- PostgreSQL database dump complete
--


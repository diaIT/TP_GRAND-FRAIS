ALTER TABLE personne
    ADD CONSTRAINT fk_personne_departement
        FOREIGN KEY (departement_code)
            REFERENCES departement (code);

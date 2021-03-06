package com.jeidc.nimus_backend;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.jeidc.nimus_backend");

        noClasses()
            .that()
                .resideInAnyPackage("com.jeidc.nimus_backend.service..")
            .or()
                .resideInAnyPackage("com.jeidc.nimus_backend.repository..")
            .should().dependOnClassesThat()
                .resideInAnyPackage("..com.jeidc.nimus_backend.web..")
        .because("Services and repositories should not depend on web layer")
        .check(importedClasses);
    }
}

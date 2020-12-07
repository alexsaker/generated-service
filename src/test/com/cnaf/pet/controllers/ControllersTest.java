package com.cnaf.pet;


import org.junit.Test;

import org.hamcrest.Matcher;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ControllersTest {

    @Test
    public void getPets_LimitDefined_Is_Yes() {
        given()
            .queryParam( "limit", "-830669716")
        .when()
            .request( "GET", "http://petstore.swagger.io/v1/pets")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void getPets_LimitDefined_Is_No() {
        given()
        .when()
            .request( "GET", "http://petstore.swagger.io/v1/pets")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void getPets_LimitValue_Is_0() {
        given()
            .queryParam( "limit", "0")
        .when()
            .request( "GET", "http://petstore.swagger.io/v1/pets")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void getPets_LimitValue_Is_Gt_0() {
        given()
            .queryParam( "limit", "1060887170")
        .when()
            .request( "GET", "http://petstore.swagger.io/v1/pets")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void getPets_LimitType_Is_Null() {
        given()
            .queryParam( "limit", "")
        .when()
            .request( "GET", "http://petstore.swagger.io/v1/pets")
        .then()
            // limit.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void getPets_LimitType_Is_NotInteger() {
        given()
            .queryParam( "limit", "fcribnqqy,true,pwxjfkkrgtjhtx,;C+>f.JX, 6,^,lwuqtwofynftzscn,true")
        .when()
            .request( "GET", "http://petstore.swagger.io/v1/pets")
        .then()
            // limit.Type=Not integer
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postPets_BodyDefined_Is_Yes() {
        given()
            .contentType( "application/json")
            .request().body( "{\"name\":\"RS7/[kw=Av[/dAj.ED$m &m0{'f2sz-E|-<*hNEYUc,61dOeat.&s>aT^j$0;Du0T`9Z@&mpRH~RHBN(@'RCvdoR/w0[mmfei)cGYjkisuA4sAd#lbWvlHYRNf,tr:Ud|[ex+Kgj%Q.mMVMUE1#FA]^Z6|`/E)zvzTV\\\"lt|r4`OEFXM\",\"tag\":\"T8>n`R9KNe@[SY_6b,3`@>?jx3yTZ|57k)5a8c-A30oAi9x\\\\TCFFYJpg-S)mJK5Xra6X%dacdLmr$:B8 #pD>2X\\\\ +/m-5[KM/OX%j[Ajd)uI8'>E=q4Qwr7!4 e]OS39ytU1\\\"5BJJ2bkH8F-{|SiuJPh r&rqq.]Q-Zh'vf~SPFv$#W`!2<Sk8PMCf\",\"id\":-187991814465576779,\"mjhah\":\"?M\",\"j\":true,\"l\":true}")
        .when()
            .request( "POST", "http://petstore.swagger.io/v1/pets")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void postPets_BodyDefined_Is_No() {
        given()
        .when()
            .request( "POST", "http://petstore.swagger.io/v1/pets")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void postPets_BodyApplicationJsonValuePropertiesIdValue_Is_0() {
        given()
            .contentType( "application/json")
            .request().body( "{\"name\":\"\",\"id\":0}")
        .when()
            .request( "POST", "http://petstore.swagger.io/v1/pets")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void postPets_BodyApplicationJsonValuePropertiesIdValue_Is_Gt_0() {
        given()
            .contentType( "application/json")
            .request().body( "{\"name\":\"P%k;xrJ'XdWJEM@!YKjz\\\\26|`gE;uD_|kCtMo%{I7!|?M]mv<F(0\\\"*\\\\7t@`fk&rH5Zs71=a|zeGOz1Y7q&K~yg e_h 'Aw,*+EY]uniitmV\\\"\\\"4yrbx `NWJG%neC5guPbMv]fdZ{dtE@MNmzwX\\\"]r z|Zl`vaW\",\"tag\":\"\",\"id\":3579221781846649634,\"z\":{\"ox\":390,\"wtzosgorukxrr\":true,\"enfroeu\":\"\"},\"gryzren\":[\"7Upw\",\"yQxh\",\"Y#r~Q\"],\"j\":[\" :~r\",\"1OLWW\\\"\"]}")
        .when()
            .request( "POST", "http://petstore.swagger.io/v1/pets")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void postPets_BodyMediaType_Is_Other() {
        given()
            .contentType( "text/plain")
            .request().body( "r|i(TC/")
        .when()
            .request( "POST", "http://petstore.swagger.io/v1/pets")
        .then()
            // Body.Media-Type=Other
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postPets_BodyApplicationJsonType_Is_Null() {
        given()
            .contentType( "application/json")
            .request().body( "null")
        .when()
            .request( "POST", "http://petstore.swagger.io/v1/pets")
        .then()
            // Body.application-json.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postPets_BodyApplicationJsonType_Is_NotObject() {
        given()
            .contentType( "application/json")
            .request().body( "\"~0NUr\"")
        .when()
            .request( "POST", "http://petstore.swagger.io/v1/pets")
        .then()
            // Body.application-json.Type=Not object
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postPets_BodyApplicationJsonValuePropertiesIdDefined_Is_No() {
        given()
            .contentType( "application/json")
            .request().body( "{\"name\":\"\"}")
        .when()
            .request( "POST", "http://petstore.swagger.io/v1/pets")
        .then()
            // Body.application-json.Value.Properties.id.Defined=No
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postPets_BodyApplicationJsonValuePropertiesIdType_Is_Null() {
        given()
            .contentType( "application/json")
            .request().body( "{\"name\":\"\",\"id\":null}")
        .when()
            .request( "POST", "http://petstore.swagger.io/v1/pets")
        .then()
            // Body.application-json.Value.Properties.id.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postPets_BodyApplicationJsonValuePropertiesIdType_Is_NotInteger() {
        given()
            .contentType( "application/json")
            .request().body( "{\"name\":\"\",\"id\":[\")5\"]}")
        .when()
            .request( "POST", "http://petstore.swagger.io/v1/pets")
        .then()
            // Body.application-json.Value.Properties.id.Type=Not integer
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postPets_BodyApplicationJsonValuePropertiesNameDefined_Is_No() {
        given()
            .contentType( "application/json")
            .request().body( "{\"id\":-3302880308980370261}")
        .when()
            .request( "POST", "http://petstore.swagger.io/v1/pets")
        .then()
            // Body.application-json.Value.Properties.name.Defined=No
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postPets_BodyApplicationJsonValuePropertiesNameType_Is_Null() {
        given()
            .contentType( "application/json")
            .request().body( "{\"name\":null,\"id\":-816422084289015124}")
        .when()
            .request( "POST", "http://petstore.swagger.io/v1/pets")
        .then()
            // Body.application-json.Value.Properties.name.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postPets_BodyApplicationJsonValuePropertiesNameType_Is_NotString() {
        given()
            .contentType( "application/json")
            .request().body( "{\"name\":11,\"id\":-1669987990294739308}")
        .when()
            .request( "POST", "http://petstore.swagger.io/v1/pets")
        .then()
            // Body.application-json.Value.Properties.name.Type=Not string
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postPets_BodyApplicationJsonValuePropertiesTagType_Is_Null() {
        given()
            .contentType( "application/json")
            .request().body( "{\"name\":\"\",\"id\":-3029198010824787714,\"tag\":null}")
        .when()
            .request( "POST", "http://petstore.swagger.io/v1/pets")
        .then()
            // Body.application-json.Value.Properties.tag.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postPets_BodyApplicationJsonValuePropertiesTagType_Is_NotString() {
        given()
            .contentType( "application/json")
            .request().body( "{\"name\":\"\",\"id\":-2025827537329290195,\"tag\":[]}")
        .when()
            .request( "POST", "http://petstore.swagger.io/v1/pets")
        .then()
            // Body.application-json.Value.Properties.tag.Type=Not string
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void getPetsPetId_PetIdDefined_Is_Yes() {
        given()
            .pathParam( "petId", "*(tNhC6!XFWxfE{U*|\\XST$|zek L^U,']ksS=(qp6E*WYst bQV+{P_7#RhPh!BI^^0D8Sy]YX{$P(G4.7#t:O7*y|YpU>")
        .when()
            .request( "GET", "http://petstore.swagger.io/v1/pets/{petId}")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void getPetsPetId_PetIdValueLength_Is_0() {
        given()
            .pathParam( "petId", "")
        .when()
            .request( "GET", "http://petstore.swagger.io/v1/pets/{petId}")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void getPetsPetId_PetIdType_Is_Null() {
        given()
            .pathParam( "petId", "")
        .when()
            .request( "GET", "http://petstore.swagger.io/v1/pets/{petId}")
        .then()
            // petId.Type=null
            .statusCode( isBadRequest())
            ;
    }

    private Matcher<Integer> isSuccess() {
        return allOf( greaterThanOrEqualTo(200), lessThan(300));
    }

    private Matcher<Integer> isBadRequest() {
        return allOf( greaterThanOrEqualTo(400), lessThan(500));
    }
}

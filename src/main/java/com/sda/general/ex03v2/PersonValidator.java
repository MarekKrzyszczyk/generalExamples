package com.sda.general.ex03v2;

import com.sda.regularexpressions.ex01.TelephoneValidator;
import com.sda.regularexpressions.ex03.NameValidator;

public class PersonValidator {
    private TelephoneValidator telephoneValidator;
    private NameValidator nameValidator;
    private EmailValidator emailValidator;

    public PersonValidator() {
        this.telephoneValidator = new TelephoneValidator();
        this.nameValidator = new NameValidator();
        this.emailValidator = new EmailValidator();
    }

    public boolean validate(String name, String surname, String phoneNumber, String email){
        if(nameValidator.validate(name)&&nameValidator.validate(surname)&&telephoneValidator.validate(phoneNumber)
        &&emailValidator.validate(email)){
            return true;
        }
        return false;
    }

}

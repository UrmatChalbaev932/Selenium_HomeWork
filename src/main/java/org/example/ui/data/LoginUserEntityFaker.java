package org.example.ui.data;

import org.example.ui.entity.LoginUserEntity;

public class LoginUserEntityFaker extends FakerBase{

    //создали метод для инициализации свойств обьекта User фейковыми дынными
    public static LoginUserEntity createNewUserWithFakeData(){
        LoginUserEntity user = new LoginUserEntity();
        user.setFirstName(faker.name().firstName());
        user.setLastName(faker.name().lastName());
        user.setUserName(faker.name().username());
        user.setPassword(generatePassword()); // вызвали метод генерации пароля
        return user;
    }
}

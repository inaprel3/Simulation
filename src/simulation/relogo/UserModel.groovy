//UserModel.groovy
package simulation.relogo

import repast.simphony.relogo.Observer

class UserModel {
    UserObserver userObserver = new UserObserver()
    UserTurtle userTurtle = new UserTurtle()
    UserPatch userPatch = new UserPatch()
    UserLink userLink = new UserLink()

    def setup() {
        // Инициализация модели
        userObserver.setup()
        userTurtle.setup()
        userPatch.setup()
        userLink.setup()
    }

    def go() {
        // Ваша логика моделирования
        userObserver.go()
        userTurtle.go()
        userPatch.go()
        userLink.go()
    }
}
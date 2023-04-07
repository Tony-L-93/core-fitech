import pojos.Machine;
import pojos.Person;
import pojos.Routine;
import services.RoutineFinder;
import validators.RoutineValidator;

import java.util.Arrays;

public class FrontController {

    public static void main(String[] args) {
        Person person = new Person(new Routine("rutina_a", Arrays.asList("A1","A2")), "persona_1", "persona_1");
        Machine machine = new Machine("A1","maquina_1");
        FrontController frontController = new FrontController();
        boolean validar = frontController.validar(person, machine);
        System.out.println("Validar: " + validar);

    }

    public boolean validar(Person persona, Machine machine){
        RoutineValidator routineValidator = new RoutineValidator(new RoutineFinder());
        return routineValidator.validate(persona, machine);
    }
}
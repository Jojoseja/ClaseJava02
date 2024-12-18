package cactus03;

public class teoriaObjetos01 {


    //se crean la class
    public static class num5{
        //en este caso x es un atributo
        int x = 5;
    }

    public static class persona{
        String fname;
        String lname;
        int edad;
    }
    public static void main(String[] args) {
        //se crea el objeto {myObj} de la clase que hemos creado, se pueden hacer tantos objetos como se quiera
        num5 myObj = new num5();
        num5 myObj1 = new num5();
        //se pueden editar los valores a posteriori, y puede no ser modificable si se le declara final
        myObj1.x = 10;
        //Este output dará 5
        System.out.println(myObj1.x- myObj.x);


        persona id1 = new persona();
        id1.fname = "Carlos";
        id1.lname = "Enrique";
        id1.edad = 25;
        System.out.println(id1.fname + " " + id1.lname + " " + "tiene " + id1.edad + " años");
    }
}

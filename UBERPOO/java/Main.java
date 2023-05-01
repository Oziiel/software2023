class Main {

public static void main(String[] 
args) {
    System.out.println
    ("Inicializando....");
    System.out.println("Car....");
    Car car = new Car("AMQ123" , new
    Account("Andres Loiza", "ADN1235" , "andresl@hotmail.com"
,"12365"    ));
car.passenger = 4 ;
car.printDataCar();

System.out.println("Uberx....");
UberX uberx = new Uberx
("MKL185" , new Account ("Maria loloya" , "JKL12365 ,"
"marial@hotmail.com" , "123478"),
"Toyota" , "Corolla")

}
}



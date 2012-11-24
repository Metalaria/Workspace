import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out; 

public class blackjack {

public static void main(String[] args) {
//Declaring Variables
Random randomizer = new Random();
Scanner s = new Scanner (System.in);
int roundcard = 0;
int playertotal = 0;
int aitotal = 0;
int tf = 1;
boolean won = false;
//The welcome message
out.println ("Bienvenido al BlackJack!");
out.println ("Barajando cartas...");
aitotal = (aitotal + randomizer.nextInt(7) + 15);
//The main stand/hit loop
while ((tf) == 1 && (playertotal) <= 21) {
roundcard = (randomizer.nextInt(9) + 2);
playertotal = (roundcard + playertotal);
out.print ("Has sacado un ");
out.print (roundcard);
out.print (" puntos, tu puntuación total es ");
out.println (playertotal);
out.print ("Pulsa 0 para plantarteo 1 para continuar: ");
tf = (s.nextInt());
}

if ((playertotal) > 21) {
System.out.println ("Has perdido");
}else {
out.print ("Tu puntuación total es ");
out.println (playertotal);
out.print ("La puntuación final de tu oponente es ");
out.println (aitotal);
if ((playertotal) > (aitotal) && (playertotal) < 22) {
out.println ("¡Has ganado!");
}
else if ((playertotal) < (aitotal)) {
out.println ("¡Has perdido!");
} else if ((playertotal) == (aitotal)) {
out.println ("Empate");
}
}
}
}
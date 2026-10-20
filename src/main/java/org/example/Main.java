import org.example.ImportoNonValidoException;
import org.example.SaldoInsufficienteException;
import org.example.contoBancario;

import static java.lang.IO.println;

void main(){
    contoBancario conto;
    conto = new contoBancario(100.00);

    try{
        conto.Preleva(10.0);
        println("Prelevati!");
    }catch(ImportoNonValidoException | SaldoInsufficienteException e){
        println("errore: " + e.getMessage());
    }

    try{
        conto.Preleva(-100.00);
        println("Prelevati!");
    }catch(ImportoNonValidoException | SaldoInsufficienteException e){
        println("errore: " + e.getMessage());
    }

    try{
        conto.Preleva(140.00);
        println("Prelevati!");
    }catch(ImportoNonValidoException | SaldoInsufficienteException e){
        println("errore: " + e.getMessage());
    }
}
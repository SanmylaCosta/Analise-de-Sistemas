import java.util.Arrays;
import java.util.Scanner;

import domain.Cliente;
import domain.Veterinario;
import domain.Animal;
import domain.Especie;
import domain.Consulta;
import domain.Exame;
import domain.Tratamento;



public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente(1, "Carlos", "Rua das Couves","30006654444");
        System.out.println(cliente);
    }
}

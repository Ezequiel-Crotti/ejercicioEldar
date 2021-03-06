package Tarjetas;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {

		Visa tarjetaVisa = new Visa("1234-1234-1234-1234", "Juan Carlos", LocalDate.of(21, 3, 1), "Visa", 900);
		Nara tarjetaNara = new Nara("1784-9334-1649-0004", "Analia Bola?os", LocalDate.of(23, 12, 1), "Naranja", 500);
		Amex tarjetaAmex = new Amex("8224-9031-0098-2304", "Franco Bola?os", LocalDate.of(27, 9, 1), "Amex", 1100);

		// Indica si la tarjeta es valida
		if (tarjetaVisa.validaFechaVencimiento()) {
			System.out.println("La tarjeta Visa es valida");
		} else {
			System.out.println("La tarjeta Visa No es valida");
		}
		if (tarjetaNara.validaFechaVencimiento()) {
			System.out.println("La tarjeta Naranja es valida");
		} else {
			System.out.println("La tarjeta Naranja No es valida");
		}
		if (tarjetaAmex.validaFechaVencimiento()) {
			System.out.println("La tarjeta Amex es valida");
		} else {
			System.out.println("La tarjeta Amex No es valida");
		}

		// Informa si la operacion es valida
		if (tarjetaNara.validaConsumo()) {
			System.out.println("La operacion es valida");
		} else {
			System.out.println("La operacion No es valida");
		}
		if (tarjetaAmex.validaConsumo()) {
			System.out.println("La operacion es valida");
		} else {
			System.out.println("La operacion No es valida");
		}
		if (tarjetaVisa.validaConsumo()) {
			System.out.println("La operacion es valida");
		} else {
			System.out.println("La operacion No es valida");
		}

		// Informar datos de tarjeta
		tarjetaAmex.datosTarjeta();
		tarjetaNara.datosTarjeta();
		tarjetaVisa.datosTarjeta();

		// Identificar si las tarjetas son distintas
		if (tarjetaAmex.equals(tarjetaNara)) {
			System.out.println("Las tarjetas son iguales");
		} else {
			System.out.println("Las tarjetas son distintas");
		}

		if (tarjetaAmex.equals(tarjetaAmex)) {
			System.out.println("Las tarjetas son iguales");
		} else {
			System.out.println("Las tarjetas son distintas");
		}

		if (tarjetaVisa.equals(tarjetaAmex)) {
			System.out.println("Las tarjetas son iguales");
		} else {
			System.out.println("Las tarjetas son distintas");
		}

	}

}

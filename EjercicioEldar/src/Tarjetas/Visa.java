package Tarjetas;
import java.time.LocalDate;

public class Visa extends TarjetaCredito implements ITarjetaCredito {

	public Visa(String nt, String ch, LocalDate fv, String marca, int mc) {
		setNumeroTarjeta(nt);
		setCardHolder(ch);
		setFechaVencimiento(fv);
		setMarca(marca);
		setMontoConsumido(mc);
	}
	
	public Visa() {
		
	}

	public double Tasa() {
		int a?o = LocalDate.now().getYear();
		int mes = LocalDate.now().getMonthValue();
		return a?o / mes;
	}

	@Override
	public double calculoTasa(int monto) {
		return monto * Tasa();
	}

}

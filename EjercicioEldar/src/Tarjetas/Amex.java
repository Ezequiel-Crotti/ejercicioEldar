package Tarjetas;
import java.time.LocalDate;

public class Amex extends TarjetaCredito implements ITarjetaCredito {

	public Amex(String nt, String ch, LocalDate fv, String marca, int mc) {
		setNumeroTarjeta(nt);
		setCardHolder(ch);
		setFechaVencimiento(fv);
		setMarca(marca);
		setMontoConsumido(mc);
	}
	
	public Amex() {
		
	}

	public double Tasa() {
		int mes = LocalDate.now().getMonthValue();
		return mes / 0.1;
	}

	@Override
	public double calculoTasa(int monto) {
		return monto * Tasa();
	}
}

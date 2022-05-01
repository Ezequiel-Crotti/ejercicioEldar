package Tarjetas;
import java.time.LocalDate;

public class Nara extends TarjetaCredito implements ITarjetaCredito {

	public Nara(String nt, String ch, LocalDate fv, String marca, int mc) {
		setNumeroTarjeta(nt);
		setCardHolder(ch);
		setFechaVencimiento(fv);
		setMarca(marca);
		setMontoConsumido(mc);
	}

	public Nara() {
		
	}
	public double Tasa() {
		int diaMes = LocalDate.now().getDayOfMonth();
		return diaMes / 0.5;
	}

	@Override
	public double calculoTasa(int monto) {
		return monto * Tasa();
	}
}

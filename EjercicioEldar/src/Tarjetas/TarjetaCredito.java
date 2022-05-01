package Tarjetas;
import java.time.LocalDate;
import java.util.Date;

public class TarjetaCredito {

	private String numeroTarjeta;
	private String cardHolder;
	private LocalDate fechaVencimiento;
	private String marca;
	private int montoConsumido;

	public boolean validaConsumo() {

		if (this.montoConsumido < 1000 && this.montoConsumido > 0) {
			return true;
		}
		return false;
	}

	public boolean validaFechaVencimiento() {
		return this.fechaVencimiento.isBefore(LocalDate.now());
	}

	public void datosTarjeta() {
		System.out.println("Datos de la Tarjeta\n");
		System.out.println("\n\tMarca: " + this.marca);
		System.out.println("\n\tNombre y Apellido: " + this.cardHolder);
		System.out.println("\n\tNumero de Tarjeta: " + this.numeroTarjeta);
		System.out.println("\n\tFecha de Vencimiento: " + this.fechaVencimiento.getMonth() + "/"
				+ this.fechaVencimiento.getYear());
		System.out.println("\n\tMonto Consumido: " + this.montoConsumido);
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMontoConsumido() {
		return montoConsumido;
	}

	public void setMontoConsumido(int montoConsumido) {
		this.montoConsumido = montoConsumido;
	}

}

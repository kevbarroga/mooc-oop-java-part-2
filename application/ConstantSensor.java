package application;

public class ConstantSensor implements Sensor {
	private final int temperature;

	public ConstantSensor(int temp) {
		this.temperature = temp;
	}

	@Override
	public boolean isOn() {
		return true;
	}

	@Override
	public void on() {
	}

	@Override
	public void off() {
	}

	@Override
	public int measure() {
		return this.temperature;
	}

}

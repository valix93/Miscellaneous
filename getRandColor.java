protected int getRandColor() {
		Random color = new Random();

		int randomColor = Color.rgb(color.nextInt(256), color.nextInt(256),
				color.nextInt(256));

		return randomColor;
	}

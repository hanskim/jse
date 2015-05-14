package oop01_game;

public class NumberMatchVO {

	int player, com, count;

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		if (player < 1 || player > 3) {
			System.out.println("1부터 5까지 정수만 입력해야함");
		} else {
			this.player = player;
		}
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {

	}

	public void setCom() {
		this.com = (int) ((Math.random() * 5) + 1);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}

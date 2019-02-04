//These 2 are the same.

interface Runner {
  int speed();
  double distance=70;
}

interface Runner {
  public abstract int speed();
  public static final double distance=70;
}

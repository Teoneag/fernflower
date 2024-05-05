package records;

public record TestRecordComplexConstructorGetter(int x, int y, int z, int w) {
  /**
   * This constructor shouln't be removed
   */
  public TestRecordComplexConstructorGetter(int x, int y, int z, int w) {
    this.x = y;
    this.y = x;
    this.z = z;
    this.w = w;
  }

  /**
   * This getter shouldn't be removed
   */
  public int getX() {
    return x + 1;
  }

  /**
   * This getter shouldn't be removed
   */
  public int getY() {
    System.out.println("This extra line makes the getter special");
    return y;
  }

  // The getZ constructor is a default one, so should be removed

  /**
   * This getter is a default one, should be removed
   */
  public int getW() {
    return w;
  }
}
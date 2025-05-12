public int dogWalkShift(int startHour, int endHour) {
  int total = 0;
  for (int i = startHour; i <= endHour; i++) {
    int dogs = walkDogs(i);
    total += dogs*5;
      if (dogs == maxDogs || (i >= 9 && i <= 17)) {
        total += 3;
      }
    }
      return total;
}

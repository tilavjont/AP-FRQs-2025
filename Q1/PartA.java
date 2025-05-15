public int walkDogs(int hour) {

    // find out from DogWalkCompany how many dogs at hour
    int numDogs = company.numAvailableDogs(hour);

    // if walker can walk more (or equal) dogs than available
    if (maxDogs >= numDogs) {
        company.updateDogs(hour, numDogs);
        return numDogs;
    } else {
        company.updateDogs(hour, numDogs);
        return maxDogs;
    }
}

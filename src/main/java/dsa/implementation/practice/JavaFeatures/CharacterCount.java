package dsa.implementation.practice.JavaFeatures;

interface CharacterCount {
    @FunctionalInterface
    interface CharacterCountFunction{
        int countCharacters(char character);
    }
}

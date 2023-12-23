package Factory;

import Adapter.Dictionary;
import Adapter.EnglishRussianDictionary;

public class EnglishRussianDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary createDictionary() {
        return new EnglishRussianDictionary();
    }
}
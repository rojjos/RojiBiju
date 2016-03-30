
    public class WordGeneratorUnitTester {

        @Test
        public void generateWordTest(){

            WordGenerator generator = new WordGenerator();
            char letter = (char)(Math.random()*26 + 65);
            String word = generator.generateWord(letter);
            assertTrue(word.startsWith(""+letter));


        }


    }

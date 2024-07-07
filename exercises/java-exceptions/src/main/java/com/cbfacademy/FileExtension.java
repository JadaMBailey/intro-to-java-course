import java.util.List;

public class FileExtension{

    public boolean check(String filename) throws FilenameException
    {
        if(filename.contains(".java")){
            return true;
        } else
        {
            return false;
        }
        throw new FilenameException("Not a java file.");
        
    }

    public Map<String, Integer> map(List<String> filenames)
    {

        return 0;
    }


}

/*
 * Create a custom (checked) exception class called `FilenameException`.

Create a class called `FileExtension` with the following methods:

- `boolean check(String filename)`
- `Map<String, int> map(List<String> filenames)`

The `check` method should:
- return `true` when the file extension is `.java`
- return `false` when the file extension is not `.java`
- throw a `FilenameException` when the file name is `null` or an empty string.

The `map` method should:
- check each provided file's extension and map the returned value as 1 if true or 0 if false
- map `-1` when an exception occurs

**Example**

For the following list of file names: `Arrays.asList("App.java", "App.txt", null, "App.md")`, the `map` method should return a map with the following entries:

```txt
{"App.java", 1},
{"App.txt", 0},
{null, -1},
{"App.md", 0}
```

#### :white_check_mark: Verify Your Implementation

To verify that your code works as expected, run the provided unit tests.

In your terminal, ensure that you are in the `java-exceptions` folder, then run the following command:

```shell
./mvnw clean test
```

If you are on Windows, run this command instead:

```bat
mvnw clean test
```

Your implementation is correct when all tests pass.

#### :information_source: Notes
If you want to experiment with the provided application in the App.java file, you can run the following command from the terminal:

```shell
./mvnw -q clean compile exec:java
```
```

Or on Windows:

```bat
mvnw -q clean compile exec:java
 * 
 * 
 * 
 */
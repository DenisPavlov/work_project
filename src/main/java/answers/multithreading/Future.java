package answers.multithreading;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * код для CompletableFuture
 * https://vertex-academy.com/tutorials/ru/java-8-completablefuture/
 */
public class Future {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> what = CompletableFuture.supplyAsync(() -> "What");
        CompletableFuture<String> the = CompletableFuture.supplyAsync(() -> "the");
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "future");
        CompletableFuture<String> holds = CompletableFuture.supplyAsync(() -> "holds?");

        String result = Stream.of(what, the, future, holds)
                .map(m -> m.join())
                .collect(Collectors.joining(" "));

        System.out.println(result); //output: What the future holds?
        Map<String, Integer> map = new HashMap<>();
        map.replaceAll((k, v) -> v++);
    }
}

package bfhl.controller;

import bfhl.model.RequestData;
import bfhl.model.ResponseData;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/bfhl")
public class BfhlController {

    @GetMapping
    public Map<String, Integer> getOperationCode() {

        return Map.of(
                "operation_code", 1
        );
    }

    @PostMapping
    public ResponseData processData(@RequestBody RequestData request) {

        List<String> numbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();

        for (String item : request.getData()) {

            if (item.matches("\\d+")) {
                numbers.add(item);
            }

            else if (item.matches("[a-zA-Z]+")) {
                alphabets.add(item);
            }
        }

        List<String> highestAlphabet = new ArrayList<>();

        if (!alphabets.isEmpty()) {

            String max = Collections.max(alphabets);
            highestAlphabet.add(max);
        }

        return new ResponseData(
                true,
                "azhar_khan",
                "azharkhan230826@acropolis.in",
                "0827CS231059",
                numbers,
                alphabets,
                highestAlphabet
        );
    }
}
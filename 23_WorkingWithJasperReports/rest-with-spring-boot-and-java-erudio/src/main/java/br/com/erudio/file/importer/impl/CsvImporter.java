package br.com.erudio.file.importer.impl;

import br.com.erudio.data.dto.PersonDTO;
import br.com.erudio.file.importer.contract.FileImporter;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class CsvImporter implements FileImporter {

    @Override
    public List<PersonDTO> importFile(InputStream inputStream) throws Exception {
        CSVFormat format = CSVFormat.Builder.create()
                .setHeader()
                .setSkipHeaderRecord(true)
                .setIgnoreEmptyLines(true)
                .setTrim(true)
                .build();

        Iterable<CSVRecord> records = format.parse(new InputStreamReader(inputStream));
        return parseRecordsToPersonDTOs(records);
    }

    private List<PersonDTO> parseRecordsToPersonDTOs(Iterable<CSVRecord> records) {
        List<PersonDTO> people = new ArrayList<>();

        for (CSVRecord record : records) {
            PersonDTO person = new PersonDTO();
            person.setFirstName(record.get("first_name"));
            person.setLastName(record.get("last_name"));
            person.setAddress(record.get("address"));
            person.setGender(record.get("gender"));
            person.setEnabled(true);
            people.add(person);
        }
        return people;
    }
}

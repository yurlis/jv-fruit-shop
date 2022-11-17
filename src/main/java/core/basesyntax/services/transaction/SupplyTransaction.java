package core.basesyntax.services.transaction;

import core.basesyntax.dbreport.ReportStorage;

public class SupplyTransaction implements Transaction {
    @Override
    public void doFruitTransaction(String fruit, int quantity) {
        ReportStorage.report.put(fruit, ReportStorage.report.get(fruit) + quantity);
    }
}

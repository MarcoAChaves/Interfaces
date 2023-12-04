package Exercicio.services;

import Exercicio.entities.Contract;
import Exercicio.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract (Contract contract, int months){

        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);

            //método para calcular o juros
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
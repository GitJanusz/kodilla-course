package com.kodilla.good.patterns.challenges.task2;

public class ProductOrderService {

    private MailConfirmation mailConfirmation;
    private OrderRepository orderRepository;
    private SaleService saleService;

    public ProductOrderService(final MailConfirmation mailConfirmation, final OrderRepository orderRepository, final SaleService saleService) {
        this.mailConfirmation = mailConfirmation;
        this.orderRepository = orderRepository;
        this.saleService = saleService;
    }

    public OrderedDto process(final PurchaseRequest purchaseRequest) {
        boolean isOrdered = orderRepository.createOrder(purchaseRequest.getUser(), purchaseRequest.getProduct(), purchaseRequest.getOrder());
        if (isOrdered) {
            saleService.sale(purchaseRequest.getUser(), purchaseRequest.getProduct(), purchaseRequest.getOrder());
            mailConfirmation.sendConfirmation(purchaseRequest.getUser(), purchaseRequest.getProduct(), purchaseRequest.getOrder());
            return new OrderedDto(purchaseRequest.getUser(), true);
        } else {
            return new OrderedDto(purchaseRequest.getUser(), false);
        }
    }
}

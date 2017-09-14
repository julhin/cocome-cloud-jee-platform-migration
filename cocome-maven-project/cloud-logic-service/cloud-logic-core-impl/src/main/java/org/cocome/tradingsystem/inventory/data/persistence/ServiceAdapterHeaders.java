package org.cocome.tradingsystem.inventory.data.persistence;

@Deprecated
public final class ServiceAdapterHeaders {
    static final String PRODUCTORDER_HEADER = "ProductOrderId;StoreId;ProductBarcode;"
            + "OrderDeliveryDate;OrderOrderingDate;OrderAmount";

    static final String STOCKITEM_HEADER = "StoreId;ProductBarcode;StockItemMinStock;"
            + "StockItemMaxStock;StockItemIncomingAmount;StockItemAmount;StockItemSalesPrice";

    static final String ENTERPRISE_CREATE_HEADER = "EnterpriseName";

    static final String ENTERPRISE_UPDATE_HEADER = "EnterpriseId;EnterpriseName";

    static final String STORE_CREATE_HEADER = "EnterpriseName;StoreName;StoreLocation";

    static final String STORE_UPDATE_HEADER = "EnterpriseName;StoreId;StoreName;StoreLocation";

    static final String PRODUCT_HEADER = "ProductBarcode;ProductName;ProductPurchasePrice";

    static final String PRODUCTSUPPLIER_CREATE_HEADER = "ProductSupplierName";

    static final String PRODUCTSUPPLIER_UPDATE_HEADER = "ProductSupplierId;ProductSupplierName";

    static final String USER_CREATE_HEADER = "UserName;CredentialType;CredentialString;Role";

    static final String USER_UPDATE_HEADER = "UserId;UserName;CredentialType;CredentialString;Role";

    static final String CUSTOMER_CREATE_HEADER = "FirstName;LastName;MailAddress;"
            + "UserName";

    static final String CUSTOMER_UPDATE_HEADER = "CustomerId;FirstName;LastName;MailAddress;"
            + "UserName";

    static final String CUSTOMER_CREATE_HEADER_WITH_STORE = "FirstName;LastName;MailAddress;"
            + "PreferredStoreEnterpriseName;PreferredStoreId;PreferredStoreName;PreferredStoreLocation;"
            + "UserName";

    static final String CUSTOMER_UPDATE_HEADER_WITH_STORE = "CustomerId;FirstName;LastName;MailAddress;"
            + "PreferredStoreEnterpriseName;PreferredStoreId;PreferredStoreName;PreferredStoreLocation;"
            + "UserName";
}

## Projext expecification

---

The goals is to use a streaming actectura to read data from Binance API checking crypto prince in real time.

#### Project compouse:
 * Arcquitecture

![alt text](/jevent/files/diagram.png)


----
Goal - Monitoring the change of price percentege based on a fraction based on windowSize of 1m (minute), to check others windowSize click here
https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md#rolling-window-price-change-statistics


To show te corrent priceChangePercent at the moment until change
* An event will be created to get the next price change percent
* For each new event a new request will be made
% create plots for efficiency vs f
ta = 226.0;
pa = 28.1;
M = 0.85;
Prc = 30;
Prf = 1.5;
beta = 0.8;
b = 0.15;
f = 0.01:0.001:0.0263;
fib = 0;
fab = 0;
cmps = [1, 0, 0, 0];

ovs = run_permutations(ta, pa, M, Prc, Prf, beta, b, f, fib, fab, cmps, 0);

ordvec = [];
stvec = [];
tsfcvec = [];

for iov = ovs
    ordvec = [ordvec, iov.iv.f];
    stvec = [stvec, iov.st];
    tsfcvec = [tsfcvec, iov.tsfc];
end

[ax, h1, h2] = plotyy(ordvec, stvec, ordvec, tsfcvec);
set(get(ax(1), 'Ylabel'), 'String', 'Specific Thrust (kN/(kg/s)');
set(get(ax(2), 'Ylabel'), 'String', 'Specific Fuel Consumption ((kN s)/kg');
set(h2, 'LineStyle', '--');
xlabel('Main Burner Fuel/Air Ratio');
title('Fuel/Air Ratio Trade Study');
legend([h1, h2], 'Specific Thrust', 'Specific Fuel Consumption');